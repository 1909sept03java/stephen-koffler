import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DummyWummyListComponent } from './dummy-wummy-list.component';

describe('DummyWummyListComponent', () => {
  let component: DummyWummyListComponent;
  let fixture: ComponentFixture<DummyWummyListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DummyWummyListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DummyWummyListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
