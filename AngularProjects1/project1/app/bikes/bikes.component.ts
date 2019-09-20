import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bikes',
  templateUrl: './bikes.component.html',
  styleUrls: ['./bikes.component.css']
})
export class BikesComponent implements OnInit {

    bikeData: any= '';

  bikes = [
    {
      brand: 'KTM',
      img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSS8_SQo8w4okqS7oPaA-PIsXyyeUFhU9SiJnxuNGoATjYuDk2pOw',
      description: 'In 1953, businessman Ernst Kronreif became a sizable shareholder Kraftfahrzeug Trunkenpolz Mattighofen which was then renamed and registered as Kronreif and Trunkenpolz Mattighofen. KTM started serial production of R100 in 1954. With just 20 employees, motorcycles were built at the rate of three per day.'
    },
    {
      brand: 'Mountain',
      img: 'https://cdn.pixabay.com/photo/2019/08/05/06/10/mountains-4385294_960_720.jpg',
      description: 'In 1953, businessman Ernst Kronreif became a sizable shareholder Kraftfahrzeug Trunkenpolz Mattighofen which was then renamed and registered as Kronreif and Trunkenpolz Mattighofen. KTM started serial production of R100 in 1954. With just 20 employees, motorcycles were built at the rate of three per day.'
    },
    {
      brand: 'Royal Enfield',
      img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQyfMMEuIws3fvzx9E7STjsFHDpAjWMECqsud767trl9TSYNj1r',
      description: 'Royal Enfield was a brand name under which The Enfield Cycle Company Limited of Redditch, Worcestershire[1] sold motorcycles, bicycles, lawnmowers and stationary engines which they had manufactured. Enfield Cycle Company also used the brand name Enfield without Royal.'
    },
    {
      brand: 'Sunflower',
      img: 'https://cdn.pixabay.com/photo/2019/08/05/17/16/sunflower-4386505__340.jpg',
      description: 'Royal Enfield was a brand name under which The Enfield Cycle Company Limited of Redditch, Worcestershire[1] sold motorcycles, bicycles, lawnmowers and stationary engines which they had manufactured. Enfield Cycle Company also used the brand name Enfield without Royal.'
    },
    {
      brand: 'Location',
      img: 'https://cdn.pixabay.com/photo/2019/07/21/17/09/abendstimmung-4353170__340.jpg',
      description: 'Royal Enfield was a brand name under which The Enfield Cycle Company Limited of Redditch, Worcestershire[1] sold motorcycles, bicycles, lawnmowers and stationary engines which they had manufactured. Enfield Cycle Company also used the brand name Enfield without Royal.'
    }
  ]
  constructor() { }
  sendBike(bike) {
    this.bikeData = bike;
    console.log(bike);
  }

  ngOnInit() {
  }

}
