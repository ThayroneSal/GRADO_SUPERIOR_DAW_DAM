## Ejercicio 1. 
A partir del siguiente documento XML, crea el archivo XML Schema (XSD) que valide su estructura.

Archivo XML: estudiante.xml
```xml
<estudiante>
  <nombre>Lucía Martínez</nombre>
  <edad>21</edad>
  <email>lucia.martinez@email.com</email>
</estudiante>
```
SOLUCIÓN: estudiante.xsd
```xml
 <?xml version="1.0" encoding="UTF-8"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema">

  <xs:element name="estudiante">
    <xs:complexType>
      <xs:sequence>
        <xs:element name="nombre" type="xs:string"/>
        <xs:element name="edad" type="xs:integer"/>
        <xs:element name="email" type="xs:string"/>
      </xs:sequence>
    </xs:complexType>
  </xs:element>

</xs:schema>
```

## Ejercicio 2.
Dado el siguiente XML, crea el XSD correspondiente. Observa que el elemento tiene un atributo.

Archivo XML: producto.xml
```xml
<producto categoria="ropa">
  <nombre>Chaqueta</nombre>
  <precio>49.90</precio>
</producto>
```

SOLUCIÓN: producto.xsd
```xsd
<?xml version="1.0" encoding="UTF-8"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema">

  <xs:element name="producto">
    <xs:complexType>
      <xs:sequence>
        <xs:element name="nombre" type="xs:string"/>
        <xs:element name="precio" type="xs:decimal"/>
      </xs:sequence>
      <xs:attribute name="categoria" type="xs:string" use="required"/>
    </xs:complexType>
  </xs:element>

</xs:schema>
```

## Ejercicio 3.
A partir del siguiente XSD, crea un documento XML válido.

Archivo XSD: mascota.xsd
```xsd
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema">
  <xs:element name="mascota">
    <xs:complexType>
      <xs:sequence>
        <xs:element name="nombre" type="xs:string"/>
        <xs:element name="especie" type="xs:string"/>
        <xs:element name="edad" type="xs:integer"/>
      </xs:sequence>
    </xs:complexType>
  </xs:element>
</xs:schema>
```
SOLUCIÓN:
```xml
<?xml version="1.0" encoding="UTF-8"?>
<mascota>
  <nombre>Luna</nombre>
  <especie>Perro</especie>
  <edad>3</edad>
</mascota>
```

## Ejercicio 4.
Crea un XML válido a partir del siguiente esquema, que restringe los valores posibles del atributo "genero".

Archivo XSD: libro.xsd
```xsd
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema">
  <xs:element name="libro">
    <xs:complexType>
      <xs:sequence>
        <xs:element name="titulo" type="xs:string"/>
        <xs:element name="autor" type="xs:string"/>
      </xs:sequence>
      <xs:attribute name="genero">
        <xs:simpleType>
          <xs:restriction base="xs:string">
            <xs:enumeration value="ficcion"/>
            <xs:enumeration value="no-ficcion"/>
            <xs:enumeration value="poesia"/>
          </xs:restriction>
        </xs:simpleType>
      </xs:attribute>
    </xs:complexType>
  </xs:element>
</xs:schema>
```

SOLUCIÓN:
```xml
<?xml version="1.0" encoding="UTF-8"?>
<mascota>
  <nombre>Luna</nombre>
  <especie>Perro</especie>
  <edad>3</edad>
</mascota>
```