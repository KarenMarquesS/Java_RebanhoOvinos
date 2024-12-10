package org.example.Repositorio;


import org.example.Modelo.EntidadeBase;

import java.util.List;

public interface RepositorioBase <T extends EntidadeBase>{

   void Adicionar (T entidade);
   void UpDate(T entidade);
   List<T> GetByBrinco(int n_brinco);
   List<T> GetByMaeBrinco(int mae_brinco);
   void Delete ( int n_brinco);

}
