package com.example.aviatickets.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.aviatickets.R
import com.example.aviatickets.adapter.OfferListAdapter
import com.example.aviatickets.databinding.FragmentOfferListBinding
import com.example.aviatickets.model.entity.Offer
import com.example.aviatickets.model.service.FakeService
import retrofit2.Callback
import retrofit2.Call
import com.example.aviatickets.model.service.FakeService.offerList
import retrofit2.Response


class OfferListFragment : Fragment() {

    companion object {
        private const val TAG = "OfferListFragment"
        fun newInstance() = OfferListFragment()
    }

    private var _binding: FragmentOfferListBinding? = null
    private val binding
        get() = _binding!!

    private val adapter: OfferListAdapter by lazy {
        OfferListAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOfferListBinding.inflate(layoutInflater, container, false)
        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.offerList.adapter = adapter

        setupUI()
        loadFlightOffers()
    }

    private fun loadFlightOffers() {
        val call = ApiClient.apiService.getFlightOffers()

        call.enqueue(object : Callback<List<Offer>> {
            override fun onResponse(call: Call<List<Offer>>, response: Response<List<Offer>>) {
                if (response.isSuccessful) {
                    adapter.submitList(response.body())
                } else {
                    Log.e(TAG, "Failed to fetch flight offers: ${response.code()}")
                    Toast.makeText(requireContext(), "Failed to fetch flight offers", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<List<Offer>>, t: Throwable) {
                Log.e(TAG, "Error fetching flight offers: ${t.message}")
                Toast.makeText(requireContext(), "Error fetching flight offers", Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun setupUI() {
        with(binding) {
            sortRadioGroup.setOnCheckedChangeListener { _, checkedId ->
                when (checkedId) {
                    R.id.sort_by_price -> {
                        val sortedList = FakeService.offerList.sortedBy { it.price }
                        adapter.submitList(sortedList)
                    }

                    R.id.sort_by_duration -> {
                        val sortedList = FakeService.offerList.sortedBy { it.flight.duration }
                        adapter.submitList(sortedList)
                    }
                }
            }
        }
    }
}