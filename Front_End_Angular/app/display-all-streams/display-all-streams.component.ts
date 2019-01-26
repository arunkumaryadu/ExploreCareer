import { Component, OnInit } from '@angular/core';
import { StreamService } from '../services/stream.service';

@Component({
  selector: 'app-display-all-streams',
  templateUrl: './display-all-streams.component.html',
  styleUrls: ['./display-all-streams.component.css']
})
export class DisplayAllStreamsComponent implements OnInit {
  streams:any = [
   ];
  constructor(public  rest:StreamService) { this.getData();}

  ngOnInit() {
  }
  getData() {
 
    this.rest.getData().subscribe((data: {}) => {
     console.log(data);
      this.streams = data;
    });
}
}