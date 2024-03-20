package org.example.정적팩토리메서드패턴;

public class Book {
    private String title;

    // 생성자를 private화 해서 외부에서 차단
    private Book(String title) {
        this.title = title;
    }

    // 정적 팩토리 메서드
    public static Book titleOf(String title) {
        return new Book(title); // 메서드에서 생성자를 호출하고 리턴
    }
}
