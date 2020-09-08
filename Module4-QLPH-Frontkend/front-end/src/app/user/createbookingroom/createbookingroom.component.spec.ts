import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateBookingRoomComponent } from './createbookingroom.component';

describe('CreatebookingroomComponent', () => {
  let component: CreateBookingRoomComponent;
  let fixture: ComponentFixture<CreateBookingRoomComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreateBookingRoomComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateBookingRoomComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
