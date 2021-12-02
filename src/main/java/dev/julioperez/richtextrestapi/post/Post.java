package dev.julioperez.richtextrestapi.post;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "post")
public class Post {

    @Id
    private Long id;

    private String text;

    public Post(Long id, String text) {
        this.id = id;
        this.text = text;
    }
}
