import { Component, OnInit } from '@angular/core';

import { Artist } from '../interface/artist';
import { ArtistService } from '../service/artist.service';

@Component({
  selector: 'app-artist-list',
  templateUrl: './artist-list.component.html',
  styleUrls: ['./artist-list.component.less']
})
export class ArtistListComponent implements OnInit {
	query: string = '';
  artists: Artist[] = [];
  errorMessage: string = '';

  constructor(private artistService: ArtistService) { }

  ngOnInit(): void {
  	this.getArtistsList();
  }

  showArtist(e: any, item: any) {
    this.query = item.name;
    item.highlight = !item.highlight;
  }

  getArtistsList() {
  	this.artistService.getArtists().subscribe({
  		next: artists => {
  			this.artists = artists;
  		},
  		error: err => this.errorMessage = err
  	});
  }

}
