package org.example.Repositorio;


import org.example.Modelo.EntidadeBase;

import java.util.List;
import java.util.Map;

public interface RepositorioBase <T extends EntidadeBase>{

   void Adicionar (T entidade);
   void UpDateDinamico(int n_brinco, Map<String, Object> fieldsToUpdate);
   List<T> GetByBrincoV(int n_brinco);
   List<T> GetByBrincoP(int n_brinco);
   List<T> GetByBrincoM(int n_brinco);
   List<T> GetByMaeBrinco(int mae_brinco);
   void removerPorBrinco (int n_brinco);

}
