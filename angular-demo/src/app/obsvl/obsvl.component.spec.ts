import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ObsvlComponent } from './obsvl.component';

describe('ObsvlComponent', () => {
  let component: ObsvlComponent;
  let fixture: ComponentFixture<ObsvlComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ObsvlComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ObsvlComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
