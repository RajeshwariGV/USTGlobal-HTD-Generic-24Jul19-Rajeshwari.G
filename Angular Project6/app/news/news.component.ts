import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {
  indianNews:any=[];
  

  constructor(private http:HttpClient) {
    http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=1387747318bc4228b006b57c005c849e')
    .subscribe(resData => {
      this.indianNews = resData.articles;
      console.log(this.indianNews);
    })
  }
  
  ngOnInit() {
  }

}
