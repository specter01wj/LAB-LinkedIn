import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-artist-details',
  templateUrl: './artist-details.component.html',
  styleUrls: ['./artist-details.component.less']
})
export class ArtistDetailsComponent implements OnInit {
	@Input() artist: any;

  constructor() { }

  ngOnInit(): void {
  	console.log(this.artist);
  }

}
