<%@ page import="com.hm03tasks.Tarefa" %>



<div class="fieldcontain ${hasErrors(bean: tarefaInstance, field: 'categoria', 'error')} required">
	<label for="categoria">
		<g:message code="tarefa.categoria.label" default="Categoria" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="categoria" name="categoria.id" from="${com.hm03tasks.Categoria.list()}" optionKey="id" required="" value="${tarefaInstance?.categoria?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: tarefaInstance, field: 'completo', 'error')} ">
	<label for="completo">
		<g:message code="tarefa.completo.label" default="Completo" />
		
	</label>
	<g:checkBox name="completo" value="${tarefaInstance?.completo}" />

</div>

<div class="fieldcontain ${hasErrors(bean: tarefaInstance, field: 'deadLine', 'error')} required">
	<label for="deadLine">
		<g:message code="tarefa.deadLine.label" default="Dead Line" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="deadLine" precision="day"  value="${tarefaInstance?.deadLine}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: tarefaInstance, field: 'nome', 'error')} required">
	<label for="nome">
		<g:message code="tarefa.nome.label" default="Nome" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nome" required="" value="${tarefaInstance?.nome}"/>

</div>

