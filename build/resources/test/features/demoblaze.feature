#Author: Karolayn.mazo@gmail.com
# language: es
Característica: Yo como analista de automatizacion
  requiero ver los productos de la categoria laptos

  Antecedentes:
    Dado que 'cliente' desea navegar a la pagina Demoblaze

  Escenario: Cliente desea ir a la categoria de laptos
    Cuando el hace la seleccion de la "Laptops"
    Entonces deberia ver una lista de productos

  @Segundo
  Esquema del escenario: Cliente desea ir a a la categoria y seleccionar un producto
    Cuando seleccionar la Categoria y selecciona un Producto
      | Categoria   | Producto   | Precio   | Descripcion   |
      | <Categoria> | <Producto> | <Precio> | <Descripcion> |
    Entonces verifico nombre del
      | Producto   | Precio   | Descripcion   |
      | <Producto> | <Precio> | <Descripcion> |

    Ejemplos:
      | Categoria | Producto     | Precio | Descripcion                                                                                                                                                                                                                                                                                                 |
      | Laptops   | MacBook air  |    700 |                                                                                                                      1.6GHz dual-core Intel Core i5 (Turbo Boost up to 2.7GHz) with 3MB shared L3 cache Configurable to 2.2GHz dual-core Intel Core i7 (Turbo Boost up to 3.2GHz) with 4MB shared L3 cache. |
      | Laptops   | Sony vaio i7 |    790 | REVIEW Sony is so confident that the VAIO S is a superior ultraportable laptop that the company proudly compares the notebook to Apple's 13-inch MacBook Pro. And in a lot of ways this notebook is better, thanks to a lighter weight, higher-resolution display, more storage space, and a Blu-ray drive. |
