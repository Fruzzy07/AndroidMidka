package com.example.aviatickets.model.service

import com.example.aviatickets.model.entity.Airline
import com.example.aviatickets.model.entity.Flight
import com.example.aviatickets.model.entity.Location
import com.example.aviatickets.model.entity.Offer
import java.util.UUID

object FakeService {

    val offerList = listOf(
        Offer(
            id = UUID.randomUUID().toString(),
            price = 24550,
            flight = Flight(
                departureLocation = Location(
                    cityName = "Алматы",
                    code = "ALA"
                ),
                departureTimeInfo = "20:30",
                arrivalLocation = Location(
                    cityName = "Астана",
                    code = "NQZ"
                ),
                arrivalTimeInfo = "22-30",
                flightNumber = "981",
                airline = Airline(
                    name = "Air Astana",
                    code = "KC",
                    logoUrl = "https://avatars.mds.yandex.net/i?id=68fbf3d772010d0264b5ac697f097eb93e96dd20-10703102-images-thumbs&n=13"
                ),
                duration = 120
            )
        ),
        Offer(
            id = UUID.randomUUID().toString(),
            price = 16250,
            flight = Flight(
                departureLocation = Location(
                    cityName = "Алматы",
                    code = "ALA"
                ),
                departureTimeInfo = "16:00",
                arrivalLocation = Location(
                    cityName = "Астана",
                    code = "NQZ"
                ),
                arrivalTimeInfo = "18-00",
                flightNumber = "991",
                airline = Airline(
                    name = "Air Astana",
                    code = "KC",
                    logoUrl = "https://avatars.mds.yandex.net/i?id=68fbf3d772010d0264b5ac697f097eb93e96dd20-10703102-images-thumbs&n=13"
                ),
                duration = 120
            )
        ),
        Offer(
            id = UUID.randomUUID().toString(),
            price = 8990,
            flight = Flight(
                departureLocation = Location(
                    cityName = "Алматы",
                    code = "ALA"
                ),
                departureTimeInfo = "09:30",
                arrivalLocation = Location(
                    cityName = "Астана",
                    code = "NQZ"
                ),
                arrivalTimeInfo = "11-10",
                flightNumber = "445",
                airline = Airline(
                    name = "FlyArystan",
                    code = "KC",
                    logoUrl = "https://cdn.nur.kz/images/1200x675/5a2119bb0eb0649f.jpeg?version=1"
                ),
                duration = 100
            )
        ),
        Offer(
            id = UUID.randomUUID().toString(),
            price = 14440,
            flight = Flight(
                departureLocation = Location(
                    cityName = "Алматы",
                    code = "ALA"
                ),
                departureTimeInfo = "14:30",
                arrivalLocation = Location(
                    cityName = "Астана",
                    code = "NQZ"
                ),
                arrivalTimeInfo = "16-00",
                flightNumber = "223",
                airline = Airline(
                    name = "SCAT Airlines",
                    code = "DV",
                    logoUrl = "https://avatars.mds.yandex.net/i?id=f6f32c04264e74d71cc7c3ab4a1341edd4ac8629-12496607-images-thumbs&n=13"
                ),
                duration = 90
            )
        ),
        Offer(
            id = UUID.randomUUID().toString(),
            price = 15100,
            flight = Flight(
                departureLocation = Location(
                    cityName = "Алматы",
                    code = "ALA"
                ),
                departureTimeInfo = "18:00",
                arrivalLocation = Location(
                    cityName = "Астана",
                    code = "NQZ"
                ),
                arrivalTimeInfo = "20:15",
                flightNumber = "171",
                airline = Airline(
                    name = "QazaqAir",
                    code = "IQ",
                    logoUrl = "https://sun1-17.userapi.com/s/v1/if1/2JcXOGBXu9Ap3EAYoqDexW2yw5FPcBEIlwvvVafpj4SJZqmQriZ0r6B9tpymT15wqnP8Zw.jpg?size=1535x1535&quality=96&crop=0,0,1535,1535&ava=1"
                ),
                duration = 135
            )
        )
    )
}
