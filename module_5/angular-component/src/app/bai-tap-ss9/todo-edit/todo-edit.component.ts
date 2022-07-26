import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {Todo} from "../todo";
import {TodoService} from "../service/todo.service";
import {ActivatedRoute, ParamMap, Router} from "@angular/router";

@Component({
  selector: 'app-todo-edit',
  templateUrl: './todo-edit.component.html',
  styleUrls: ['./todo-edit.component.css']
})
export class TodoEditComponent implements OnInit {

  todoForm: FormGroup;
  todo: Todo = {};

  constructor(private todoService: TodoService, private router: Router, private activeRoute: ActivatedRoute) {
  }

  ngOnInit(): void {
    this.activeRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const id = paramMap.get('id');
      this.todoService.findById(parseInt(id)).subscribe((data: Todo) => {
        this.todo = data;
        this.todoForm = new FormGroup({
          id: new FormControl(this.todo.id),
          name: new FormControl(this.todo.content)
        });
      });
    }, error => {
      console.log(error);
    });
  }

  updateTodo() {
    const todoEdit = this.todoForm.value;
    this.todoService.updateTodo(todoEdit).subscribe(data => {
    }, error => {
    }, () => {
      this.router.navigateByUrl('/todo');
    });
  }

}
