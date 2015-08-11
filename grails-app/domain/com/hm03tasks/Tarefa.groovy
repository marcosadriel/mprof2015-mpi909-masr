package com.hm03tasks

import org.grails.databinding.BindingFormat

class Tarefa {

  String nome
  @BindingFormat('ddMMyyyy')
  Date deadLine
  boolean completo
  Categoria categoria

  static constraints = {  }
}
