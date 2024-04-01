package class1.ex;

import class1.Student;


public class MovieReviewMain {
    public static void main(String[] args) {

        MovieReview movie1 = new MovieReview();
        MovieReview movie2 = new MovieReview();

        movie1.title = "인셉션";
        movie1.review = "인생은 무한 루프";

        movie2.title = "어바웃 타임";
        movie2.review = "인생 시간 영화!";

        MovieReview[] movie = new MovieReview[] {movie1, movie2};

        for (int i = 0; i < movie.length; i++){
            System.out.println(movie[i].title);
            System.out.println(movie[i].review);
        }


        for (MovieReview movieReview : movie) {
            System.out.println(movieReview.title);
            System.out.println(movieReview.review);

        }

    }
}
