package com.ldv.apiseries.model.entity

import jakarta.persistence.*
import java.sql.Date
import java.time.LocalDate


class Episode(@Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      @Column(name = "id", nullable = false)
      var id: Long? = null,
      var num: Int,
      var titre: String?,
      var dureee: Int,
      var date: Date,

    // Relation Many-to-One avec Serie (chaque saison appartient à une série)
      @ManyToOne
      @JoinColumn(name = "saison_id")
      var saison: Saison? = null
) {

}