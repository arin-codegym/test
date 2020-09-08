import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Room} from '../models/room';

@Injectable({
  providedIn: 'root'
})
export class RoomService {
  public readonly API_URL = 'http://localhost:8080/rooms';
  public readonly API_MEMBER = 'http://localhost:8080/list-member';

  constructor(private httpClient: HttpClient) {
  }
  getListRoom(): Observable<Room[]>{
    return this.httpClient.get<Room[]>(this.API_URL);
  }
  gerListMember(): Observable<any>{
    return this.httpClient.get(this.API_MEMBER);
  }
}
