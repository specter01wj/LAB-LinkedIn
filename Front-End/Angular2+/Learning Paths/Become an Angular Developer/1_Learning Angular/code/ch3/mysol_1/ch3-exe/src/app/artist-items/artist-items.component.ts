import { Component, OnInit, Input } from '@angular/core';

import { Artist } from '../interface/artist';

@Component({
  selector: 'app-artist-items',
  templateUrl: './artist-items.component.html',
  styleUrls: ['./artist-items.component.less']
})
export class ArtistItemsComponent implements OnInit {

	@Input('innerArtist') artist: Artist[] = [];

  constructor() { }

  ngOnInit(): void {
  	console.log(this.artist);
  }

}
