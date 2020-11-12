import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient,HttpHeaders } from '@angular/common/http';
import { book } from './book';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json'
  })
};

@Injectable()
export class RecommendationService{
  saveUrl: string = "http://localhost:9899/api/bookservice/book";
  getUrl: string = "http://localhost:9899/api/bookservice/books/";
delUrl: string="http://localhost:9899/api/bookservice/book/";
    constructor(private http: HttpClient) { }
    
    getBooks(apiUrl): Observable<any> {
      return this.http.get<any>(apiUrl);
    }


    saveBook(saveBook){
      console.log(saveBook);
      return this.http.post(this.saveUrl, saveBook);
    }

    
    getRecommendation(userId): Observable<any> {
      return this.http.get<any>(this.getUrl);
    }

    getMyRecommendation(): Observable<Array<book>>{
      return this.http.get<Array<book>>("http://localhost:9899/api/bookservice/books");
  }

    deleteFromRecommendationList(book:book){
      console.log(book);
      
      return this.http.delete(this.delUrl+book.id);
  }
    
}