import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NumberSortComponent } from './number-sort.component';

describe('NumberSortComponent', () => {
  let component: NumberSortComponent;
  let fixture: ComponentFixture<NumberSortComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NumberSortComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NumberSortComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
