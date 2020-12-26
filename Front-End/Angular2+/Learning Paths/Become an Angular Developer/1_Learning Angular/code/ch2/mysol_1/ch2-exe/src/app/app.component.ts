import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.less']
})
export class AppComponent {
  title = 'ch2-exe';

  query: string;
  artists: object;

  constructor() {
  	this.query = 'Barot';
  }

}
