import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StudentFullListComponent } from './student-full-list.component';

describe('StudentFullListComponent', () => {
  let component: StudentFullListComponent;
  let fixture: ComponentFixture<StudentFullListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StudentFullListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StudentFullListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
