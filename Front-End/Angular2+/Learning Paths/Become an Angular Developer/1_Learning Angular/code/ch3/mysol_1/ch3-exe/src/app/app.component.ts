import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.less']
})
export class AppComponent {
  title = 'ch3-exe';

  query: string;
  artists: any;

  showArtist(e: any, item: any) {
    this.query = item.name;
    item.highlight = !item.highlight;
  }

  constructor() {
  	this.query = '';


  	
  	this.artists = [];
  }

}
