import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.less']
})
export class AppComponent {
  title = 'ch3-exe';

  query: string = '';
  artists: any;

  showArtist(e: any, item: any) {
    this.query = item.name;
    item.highlight = !item.highlight;
  }

  constructor(private http: HttpClient) {
  }

  ngOnInit(): void {
  	this.http.get<Object>('./assets/data.json')
  		.subscribe( data => {
  			this.artists = data;
  		});
  }

}
