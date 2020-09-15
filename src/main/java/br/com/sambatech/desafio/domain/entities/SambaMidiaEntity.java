package br.com.sambatech.desafio.domain.entities;

import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder(toBuilder = true)
@Entity
public class SambaMidiaEntity implements Serializable {

    private static final long serialVersionUID = -3125776465304857325L;

    @Id
    @Type(type="pg-uuid")
    @NotNull(message = "ID é necessário")
    private UUID IdMidia;

    @NotNull
    @NotBlank(message = "Nome da mídia é necessário")
    @Size(max = 512, message = "Tamanho máximo excedido")
    private String nomeMidia;

    @Size(max = 512, message = "Tamanho máximo excedido")
    private String urlMedia;

    private Long duracaoMidia;

    @NotBlank(message = "Nome da mídia é necessário")
    @NotNull
    private Date dataUploadMidia;

    @NotBlank(message = "Nome da mídia é necessário")
    @NotNull
    private Boolean dataDeleted;
}
