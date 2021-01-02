import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ArtistItemsComponent } from './artist-items.component';

describe('ArtistItemsComponent', () => {
  let component: ArtistItemsComponent;
  let fixture: ComponentFixture<ArtistItemsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ArtistItemsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ArtistItemsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
