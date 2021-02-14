import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Artist } from './interface/artist';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.less']
})
export class AppComponent {
  title = 'ch3-exe';

  query: string = '';
  artists: Artist[] = [];
  currentArtist: any;

  showArtist(e: any, item: Artist) {
    this.query = item.name;
    item.highlight = !item.highlight;
    this.currentArtist = item;
  }

  constructor(private http: HttpClient) {
  }

  ngOnInit(): void {
  	this.http.get<Artist[]>('./assets/data.json')
  		.subscribe( data => {
  			this.artists = data;
  		});
  }

}
