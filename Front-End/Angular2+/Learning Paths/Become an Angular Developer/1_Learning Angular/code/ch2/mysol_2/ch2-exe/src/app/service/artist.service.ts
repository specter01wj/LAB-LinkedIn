import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Observable, of, throwError } from 'rxjs';
import { catchError, tap, map } from 'rxjs/operators';

import { Artist } from '../interface/artist';

@Injectable({
  providedIn: 'root'
})
export class ArtistService {

	private artistUrl = './assets/api/artist_data.json';

  constructor(private http: HttpClient) { }

  getArtists(): Observable<Artist[]> {
  	
    return this.http.get<Artist[]>(this.artistUrl)
      .pipe(
        catchError(this.handleError)
      );
  }

  private handleError(err: any) {
    let errorMessage: string;
    if (err.error instanceof ErrorEvent) {
      errorMessage = `An error occurred: ${err.error.message}`;
    } else {
      errorMessage = `Backend returned code ${err.status}: ${err.body.error}`;
    }
    console.error(err);
    return throwError(errorMessage);
  }

}
