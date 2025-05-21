<?xml version="1.0" encoding="UTF-8"?>
<xmi:XMI xmi:version="2.1" xmlns:xmi="http://schema.omg.org/spec/XMI/2.1" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:uml="http://schema.omg.org/spec/UML/2.1">
  <xmi:Documentation exporter="umbrello uml modeller 2.38.5 (Applications 23.08.5) http://umbrello.kde.org" exporterVersion="2.0.4"/>
  <uml:Model xmi:id="m1" name="Modèle UML">
    <packagedElement xmi:type="uml:Stereotype" xmi:id="folder" name="folder"/>
    <packagedElement xmi:type="uml:Stereotype" xmi:id="dataType" name="dataType"/>
    <packagedElement xmi:type="uml:Model" xmi:id="Logical_View" name="Logical View">
      <uml:Package xmi:id="Datatypes" name="Datatypes" stereotype="folder">
        <packagedElement xmi:type="uml:DataType" xmi:id="uZjJ55uEm83ph" name="char" stereotype="dataType"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="ux36MfKQ9JVSX" name="int" stereotype="dataType"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="u04O2ZcDWGj2f" name="float" stereotype="dataType"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="ufq4zMoj3IHTy" name="double" stereotype="dataType"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="uwdXHxN1UnMDC" name="bool" stereotype="dataType" isActive="false"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="uV3Uo11D4l4XB" name="string" stereotype="dataType" isActive="false"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="uEorlNyl4jaye" name="unsigned char" stereotype="dataType" isActive="false"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="u911YKVl9zoz8" name="signed char" stereotype="dataType" isActive="false"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="uI73ToUXs06I7" name="unsigned int" stereotype="dataType" isActive="false"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="um7Y6dTIVQWql" name="signed int" stereotype="dataType" isActive="false"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="u9bKrkMaNYPpZ" name="short int" stereotype="dataType" isActive="false"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="uKfusWC8vpVfE" name="unsigned short int" stereotype="dataType" isActive="false"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="uUegopHSRTwoa" name="signed short int" stereotype="dataType" isActive="false"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="u1KYx1CsAR3Yb" name="long int" stereotype="dataType" isActive="false"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="uNwbruQhfWVK7" name="signed long int" stereotype="dataType" isActive="false"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="utte5CeE6muo0" name="unsigned long int" stereotype="dataType" isActive="false"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="u90apSg5lWOkX" name="long double" stereotype="dataType" isActive="false"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="uTjj79NHZEra4" name="wchar_t" stereotype="dataType" isActive="false"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="uECO8o17xNhzo" name="Siege[*]" stereotype="dataType" isActive="false"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="u5NT2HyoWiQYr" name="boolean" stereotype="dataType"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="u6LiBLv6Mv80b" name="byte" stereotype="dataType"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="uXByz3aN6ubOP" name="short" stereotype="dataType"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="ufU8hwfcOmuem" name="long" stereotype="dataType"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="uQ5v5v8s5JHR2" name="String" stereotype="dataType"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="umamIicrIAJTF" name="Integer" stereotype="dataType"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="uUlNdcmrefvuB" name="Character" stereotype="dataType"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="uyyJ39SIemc0c" name="Boolean" stereotype="dataType"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="uqKqSRRTaNODI" name="Float" stereotype="dataType"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="uQ3zJ84ylKWCV" name="Double" stereotype="dataType"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="umB5oOYSJYL4c" name="Byte" stereotype="dataType"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="uWlFKXAz7blUs" name="Short" stereotype="dataType"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="ujz9r0RSQ441u" name="Long" stereotype="dataType"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="uceg2ja9RojPk" name="StringBuffer" stereotype="dataType"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="u9DMMuXW4UgLK" name="StringBuilder" stereotype="dataType"/>
        <packagedElement xmi:type="uml:DataType" xmi:id="uaLzD1m7zentY" name="Reservation[*]" stereotype="dataType"/>
      </uml:Package>
      <packagedElement xmi:type="uml:Class" xmi:id="uku4H11xzzata" name="Executable"/>
      <packagedElement xmi:type="uml:Class" xmi:id="u3a7oNwdZS54A" name="Reservation">
        <ownedAttribute xmi:type="uml:Property" xmi:id="uhrxix3QbPkhq" name="date" visibility="private" type="uQ5v5v8s5JHR2"/>
        <ownedOperation xmi:type="uml:Operation" xmi:id="uMzfyoNTQ2NuY" name="getDate">
          <ownedParameter xmi:type="uml:Parameter" xmi:id="uaIBEvMaHCWCx" type="uQ5v5v8s5JHR2" direction="return"/>
        </ownedOperation>
      </packagedElement>
      <packagedElement xmi:type="uml:Class" xmi:id="ugISpS66CmeV4" name="Siege">
        <ownedAttribute xmi:type="uml:Property" xmi:id="uY2nvmIVXgsbm" name="numeroSiege" visibility="private" type="ux36MfKQ9JVSX"/>
        <ownedOperation xmi:type="uml:Operation" xmi:id="uMJGuT8OYntMt" name="getReservation">
          <ownedParameter xmi:type="uml:Parameter" xmi:id="ucCfvqYZbKDxM" type="uaLzD1m7zentY" direction="return"/>
        </ownedOperation>
        <ownedOperation xmi:type="uml:Operation" xmi:id="uXOaskfDu7Uuo" name="estLibre">
          <ownedParameter xmi:type="uml:Parameter" xmi:id="uGR8ps4NFSo3t" type="u5NT2HyoWiQYr" direction="return"/>
          <ownedParameter xmi:type="uml:Parameter" xmi:id="uYwq6HtGDg8sh" name="date" visibility="private" type="uQ5v5v8s5JHR2" value=""/>
        </ownedOperation>
      </packagedElement>
      <packagedElement xmi:type="uml:Class" xmi:id="utwJU5c4deiX4" name="Wagon">
        <ownedAttribute xmi:type="uml:Property" xmi:id="uQV7VZJsDfCOR" name="classe" visibility="private" type="ux36MfKQ9JVSX"/>
        <ownedAttribute xmi:type="uml:Property" xmi:id="uxUrcpsgNsWzO" name="numeroWagon" visibility="private" type="ux36MfKQ9JVSX"/>
        <ownedOperation xmi:type="uml:Operation" xmi:id="us1USQE4TBz31" name="getSiege">
          <ownedParameter xmi:type="uml:Parameter" xmi:id="uCNkV93m9SgGY" type="uECO8o17xNhzo" direction="return"/>
        </ownedOperation>
        <ownedOperation xmi:type="uml:Operation" xmi:id="ulqt0eTq9LCyp" name="estLibre">
          <ownedParameter xmi:type="uml:Parameter" xmi:id="upISyZrSjXj7j" name="date" visibility="private" type="udKJwT8Aq5I5F" value=""/>
        </ownedOperation>
        <ownedOperation xmi:type="uml:Operation" xmi:id="u8frat32juRHt" name="getClasse">
          <ownedParameter xmi:type="uml:Parameter" xmi:id="u5u9lcS51PMJ2" type="ux36MfKQ9JVSX" direction="return"/>
        </ownedOperation>
      </packagedElement>
      <packagedElement xmi:type="uml:Class" xmi:id="uCICvSvUVzle2" name="Train">
        <ownedAttribute xmi:type="uml:Property" xmi:id="uaLCuCJfU12yn" name="nomTrain" visibility="private" type="udKJwT8Aq5I5F"/>
        <ownedOperation xmi:type="uml:Operation" xmi:id="uBaH24rcuZWPd" name="getSiegeLibre">
          <ownedParameter xmi:type="uml:Parameter" xmi:id="uejfwFOYzDXof" type="uECO8o17xNhzo" direction="return"/>
          <ownedParameter xmi:type="uml:Parameter" xmi:id="uIX1h7QZBBhkW" name="date" visibility="private" type="udKJwT8Aq5I5F" value=""/>
        </ownedOperation>
        <ownedOperation xmi:type="uml:Operation" xmi:id="uqsz7sHuLzNdX" name="getWagons"/>
      </packagedElement>
      <packagedElement xmi:type="uml:Class" xmi:id="ue6VHEr5LaqJ4" name="List"/>
      <packagedElement xmi:type="uml:Class" xmi:id="udKJwT8Aq5I5F" name="String"/>
      <packagedElement xmi:type="uml:Association" xmi:id="urquJQMXAZatW" name="">
        <ownedEnd xmi:type="uml:AssociationEnd" xmi:id="uRvL6Hi1QSOLB" name="" type="uCICvSvUVzle2" aggregation="none" isNavigable="false" changeability="changeable"/>
        <ownedEnd xmi:type="uml:AssociationEnd" xmi:id="uYXtMHCyPXtYc" name="wagon" visibility="private" type="utwJU5c4deiX4" multiplicity="*" aggregation="none" isNavigable="true" changeability="changeable"/>
      </packagedElement>
      <packagedElement xmi:type="uml:Association" xmi:id="us1N02tyv3oXZ" name="">
        <ownedEnd xmi:type="uml:AssociationEnd" xmi:id="uI4tmsXMDWlHv" name="" type="utwJU5c4deiX4" aggregation="none" isNavigable="false" changeability="changeable"/>
        <ownedEnd xmi:type="uml:AssociationEnd" xmi:id="uK4vEx1Jj65H1" name="siege" visibility="private" type="ugISpS66CmeV4" multiplicity="*" aggregation="none" isNavigable="true" changeability="changeable"/>
      </packagedElement>
      <packagedElement xmi:type="uml:Association" xmi:id="utJClrJg1RHSV" name="">
        <ownedEnd xmi:type="uml:AssociationEnd" xmi:id="u2PP8ecOD3Vdg" name="" type="u3a7oNwdZS54A" aggregation="none" isNavigable="false" changeability="changeable"/>
        <ownedEnd xmi:type="uml:AssociationEnd" xmi:id="uLJZ7DkC7TRyn" name="siege" visibility="private" type="ugISpS66CmeV4" multiplicity="1" aggregation="none" isNavigable="true" changeability="changeable"/>
      </packagedElement>
      <packagedElement xmi:type="uml:Association" xmi:id="uE9CqpUUH48HK" name="">
        <ownedEnd xmi:type="uml:AssociationEnd" xmi:id="u3jDRzC7nQwij" name="" type="uku4H11xzzata" aggregation="none" isNavigable="false" changeability="changeable"/>
        <ownedEnd xmi:type="uml:AssociationEnd" xmi:id="uJTeB4oS93JRS" name="" type="uCICvSvUVzle2" aggregation="none" isNavigable="true" changeability="changeable"/>
      </packagedElement>
      <packagedElement xmi:type="uml:Association" xmi:id="uRS2SkeClKByc" name="">
        <ownedEnd xmi:type="uml:AssociationEnd" xmi:id="uIB3wj7H17YJD" name="" type="ugISpS66CmeV4" aggregation="none" isNavigable="false" changeability="changeable"/>
        <ownedEnd xmi:type="uml:AssociationEnd" xmi:id="uPg6NZxwuyrfW" name="reservations" visibility="private" type="u3a7oNwdZS54A" multiplicity="0...*" aggregation="none" isNavigable="true" changeability="changeable"/>
      </packagedElement>
      <packagedElement xmi:type="uml:Class" xmi:id="uaMiu0M1tCdAW" name="Client">
        <ownedAttribute xmi:type="uml:Property" xmi:id="usrrwNGRGiNAQ" name="nom" visibility="private" type="uQ5v5v8s5JHR2"/>
        <ownedAttribute xmi:type="uml:Property" xmi:id="uCNgkb3LR92Rn" name="prenom" visibility="private" type="uQ5v5v8s5JHR2"/>
      </packagedElement>
      <packagedElement xmi:type="uml:Association" xmi:id="udbxfpTlG21CD" name="">
        <ownedEnd xmi:type="uml:AssociationEnd" xmi:id="uWZK0uEca7QoK" name="" type="u3a7oNwdZS54A" aggregation="none" isNavigable="false" changeability="changeable"/>
        <ownedEnd xmi:type="uml:AssociationEnd" xmi:id="uhvBVuUcMQBIs" name="client" visibility="private" type="uaMiu0M1tCdAW" multiplicity="1" aggregation="none" isNavigable="true" changeability="changeable"/>
      </packagedElement>
      <xmi:Extension extender="umbrello">
        <diagrams resolution="96">
          <diagram xmi.id="uAXgfWDHDtpRq" name="Diagramme de classes" type="1" documentation="" backgroundcolor="#ffffff" fillcolor="#ffffc0" font="Noto Sans,9,-1,5,50,0,0,0,0,0" griddotcolor="#d3d3d3" linecolor="#990000" linewidth="0" textcolor="#000000" usefillcolor="1" showattribassocs="1" showatts="1" showattsig="1" showops="1" showopsig="1" showpackage="1" showpubliconly="0" showscope="1" showstereotype="2" localid="-1" showgrid="0" snapgrid="0" snapcsgrid="0" snapx="25" snapy="25" zoom="132" canvasheight="800" canvaswidth="1100" isopen="1">
            <widgets>
              <classwidget xmi.id="utwJU5c4deiX4" localid="ubwEfYjsrTL7u" textcolor="#000000" linecolor="#990000" linewidth="0" usefillcolor="1" usesdiagramfillcolor="0" usesdiagramusefillcolor="0" fillcolor="#ffffc0" font="Noto Sans,9,-1,5,50,0,0,0,0,0,Regular" autoresize="0" x="215.152" y="265.909" width="167.727" height="96" isinstance="0" showstereotype="2" showoperations="1" showpubliconly="0" showopsigs="601" showpackage="1" showscope="1" showattributes="1" showattsigs="601"/>
              <classwidget xmi.id="uku4H11xzzata" localid="uqbJrKguFne0v" textcolor="#000000" linecolor="#990000" linewidth="0" usefillcolor="1" usesdiagramfillcolor="0" usesdiagramusefillcolor="0" fillcolor="#ffffc0" font="Noto Sans,9,-1,5,50,0,0,0,0,0" autoresize="1" x="49.6966" y="477.182" width="76" height="32" isinstance="0" showstereotype="2" showoperations="1" showpubliconly="0" showopsigs="601" showpackage="1" showscope="1" showattributes="1" showattsigs="601"/>
              <classwidget xmi.id="uCICvSvUVzle2" localid="ujWSJpi2uogzX" textcolor="#000000" linecolor="#990000" linewidth="0" usefillcolor="1" usesdiagramfillcolor="0" usesdiagramusefillcolor="0" fillcolor="#ffffc0" font="Noto Sans,9,-1,5,50,0,0,0,0,0,Regular" autoresize="0" x="173.485" y="450.757" width="257.758" height="83.6061" isinstance="0" showstereotype="2" showoperations="1" showpubliconly="0" showopsigs="601" showpackage="1" showscope="1" showattributes="1" showattsigs="601"/>
              <classwidget xmi.id="u3a7oNwdZS54A" localid="usdMInGQK5DW0" textcolor="#000000" linecolor="#990000" linewidth="0" usefillcolor="1" usesdiagramfillcolor="0" usesdiagramusefillcolor="0" fillcolor="#ffffc0" font="Noto Sans,9,-1,5,50,0,0,0,0,0,Regular" autoresize="0" x="533.034" y="217.89" width="135.697" height="56.3333" isinstance="0" showstereotype="2" showoperations="1" showpubliconly="0" showopsigs="601" showpackage="1" showscope="1" showattributes="1" showattsigs="601"/>
              <classwidget xmi.id="ugISpS66CmeV4" localid="udm0GEm9b1LGs" textcolor="#000000" linecolor="#990000" linewidth="0" usefillcolor="1" usesdiagramfillcolor="0" usesdiagramusefillcolor="0" fillcolor="#ffffc0" font="Noto Sans,9,-1,5,50,0,0,0,0,0,Regular" autoresize="0" x="497.728" y="330.303" width="209.061" height="71.5758" isinstance="0" showstereotype="2" showoperations="1" showpubliconly="0" showopsigs="601" showpackage="1" showscope="1" showattributes="1" showattsigs="601"/>
              <classwidget xmi.id="uaMiu0M1tCdAW" localid="uEX6fEKtsUDUf" textcolor="#000000" linecolor="#990000" linewidth="0" usefillcolor="1" usesdiagramfillcolor="0" usesdiagramusefillcolor="0" fillcolor="#ffffc0" font="Noto Sans,9,-1,5,50,0,0,0,0,0,Regular" autoresize="1" x="545.455" y="96.9697" width="105" height="56" isinstance="0" showstereotype="2" showoperations="1" showpubliconly="0" showopsigs="601" showpackage="1" showscope="1" showattributes="1" showattsigs="601"/>
            </widgets>
            <messages/>
            <associations>
              <assocwidget xmi.id="urquJQMXAZatW" localid="uNXgDZ9Ch1mr2" textcolor="#000000" linecolor="#990000" linewidth="0" usefillcolor="1" usesdiagramfillcolor="1" usesdiagramusefillcolor="1" fillcolor="none" font="Noto Sans,9,-1,5,50,0,0,0,0,0" autoresize="1" seqnum="" type="512" widgetaid="uCICvSvUVzle2" widgetbid="utwJU5c4deiX4" indexa="0" totalcounta="0" indexb="0" totalcountb="0">
                <floatingtext xmi.id="uT6aZgLquHw25" localid="uE9MS9aKZ87mh" textcolor="none" linecolor="#990000" linewidth="0" usefillcolor="1" usesdiagramfillcolor="1" usesdiagramusefillcolor="1" fillcolor="none" font="Noto Sans,9,-1,5,50,0,0,0,0,0,Regular" autoresize="1" x="282" y="363" width="15" height="20" isinstance="0" showstereotype="2" text="*" pretext="" posttext="" role="702"/>
                <floatingtext xmi.id="uuSDQ6ZtrsuPu" localid="uywAFJhAauPtD" textcolor="none" linecolor="#990000" linewidth="0" usefillcolor="1" usesdiagramfillcolor="1" usesdiagramusefillcolor="1" fillcolor="none" font="Noto Sans,9,-1,5,50,0,0,0,0,0,Regular" autoresize="1" x="301.915" y="363.909" width="50" height="20" isinstance="0" showstereotype="2" text="wagon" pretext="-" posttext="" role="710"/>
                <linepath layout="Direct">
                  <startpoint startx="301.58" starty="450.757"/>
                  <endpoint endx="299.915" endy="361.909"/>
                </linepath>
              </assocwidget>
              <assocwidget xmi.id="us1N02tyv3oXZ" localid="ukdh1Ea3A2Vke" textcolor="#000000" linecolor="#990000" linewidth="0" usefillcolor="1" usesdiagramfillcolor="1" usesdiagramusefillcolor="1" fillcolor="none" font="Noto Sans,9,-1,5,50,0,0,0,0,0" autoresize="1" seqnum="" type="512" widgetaid="utwJU5c4deiX4" widgetbid="ugISpS66CmeV4" indexa="0" totalcounta="0" indexb="0" totalcountb="0">
                <floatingtext xmi.id="uin7lr8cG2OJh" localid="uitSAGw1VL8W8" textcolor="none" linecolor="#990000" linewidth="0" usefillcolor="1" usesdiagramfillcolor="1" usesdiagramusefillcolor="1" fillcolor="none" font="Noto Sans,9,-1,5,50,0,0,0,0,0,Regular" autoresize="1" x="473.606" y="314.526" width="15" height="20" isinstance="0" showstereotype="2" text="*" pretext="" posttext="" role="702"/>
                <floatingtext xmi.id="up3rGfYew9qWk" localid="uGo8JzYbJOri9" textcolor="none" linecolor="#990000" linewidth="0" usefillcolor="1" usesdiagramfillcolor="1" usesdiagramusefillcolor="1" fillcolor="none" font="Noto Sans,9,-1,5,50,0,0,0,0,0,Regular" autoresize="1" x="446.91" y="348.831" width="42" height="20" isinstance="0" showstereotype="2" text="siege" pretext="-" posttext="" role="710"/>
                <linepath layout="Direct">
                  <startpoint startx="382.879" starty="328.34"/>
                  <endpoint endx="497.728" endy="348.103"/>
                </linepath>
              </assocwidget>
              <assocwidget xmi.id="uE9CqpUUH48HK" localid="uoVUnPWAd8i9T" textcolor="none" linecolor="#990000" linewidth="0" usefillcolor="1" usesdiagramfillcolor="1" usesdiagramusefillcolor="1" fillcolor="none" font="Noto Sans,9,-1,5,50,0,0,0,0,0" autoresize="1" seqnum="" type="512" widgetaid="uku4H11xzzata" widgetbid="uCICvSvUVzle2" indexa="0" totalcounta="0" indexb="0" totalcountb="0">
                <linepath layout="Direct">
                  <startpoint startx="125.697" starty="493.072"/>
                  <endpoint endx="173.485" endy="492.934"/>
                </linepath>
              </assocwidget>
              <assocwidget xmi.id="uRS2SkeClKByc" localid="uUvVWBq0zbyNw" textcolor="#000000" linecolor="#990000" linewidth="0" usefillcolor="1" usesdiagramfillcolor="1" usesdiagramusefillcolor="1" fillcolor="none" font="Noto Sans,9,-1,5,50,0,0,0,0,0" autoresize="1" seqnum="" type="512" widgetaid="ugISpS66CmeV4" widgetbid="u3a7oNwdZS54A" indexa="0" totalcounta="0" indexb="0" totalcountb="0">
                <floatingtext xmi.id="uCpLTbxGYN3Lp" localid="uaM1HiNIKcuKf" textcolor="none" linecolor="#990000" linewidth="0" usefillcolor="1" usesdiagramfillcolor="1" usesdiagramusefillcolor="1" fillcolor="none" font="Noto Sans,9,-1,5,50,0,0,0,0,0,Regular" autoresize="1" x="568" y="276" width="31" height="20" isinstance="0" showstereotype="2" text="0...*" pretext="" posttext="" role="702"/>
                <floatingtext xmi.id="u3moKXROS0RfS" localid="uDs5A76OgUO3b" textcolor="none" linecolor="#990000" linewidth="0" usefillcolor="1" usesdiagramfillcolor="1" usesdiagramusefillcolor="1" fillcolor="none" font="Noto Sans,9,-1,5,50,0,0,0,0,0,Regular" autoresize="1" x="603.205" y="276.223" width="84" height="20" isinstance="0" showstereotype="2" text="reservations" pretext="-" posttext="" role="710"/>
                <linepath layout="Direct">
                  <startpoint startx="601.848" starty="330.303"/>
                  <endpoint endx="601.205" endy="274.223"/>
                </linepath>
              </assocwidget>
              <assocwidget xmi.id="udbxfpTlG21CD" localid="uVU39x1HWl56O" textcolor="#000000" linecolor="#990000" linewidth="0" usefillcolor="1" usesdiagramfillcolor="1" usesdiagramusefillcolor="1" fillcolor="none" font="Noto Sans,9,-1,5,50,0,0,0,0,0" autoresize="1" seqnum="" type="512" widgetaid="u3a7oNwdZS54A" widgetbid="uaMiu0M1tCdAW" indexa="0" totalcounta="0" indexb="0" totalcountb="0">
                <floatingtext xmi.id="uIUpPCuPXWjMX" localid="u0L9p1maBnqja" textcolor="none" linecolor="#990000" linewidth="0" usefillcolor="1" usesdiagramfillcolor="1" usesdiagramusefillcolor="1" fillcolor="none" font="Noto Sans,9,-1,5,50,0,0,0,0,0,Regular" autoresize="1" x="581" y="154" width="15" height="20" isinstance="0" showstereotype="2" text="1" pretext="" posttext="" role="702"/>
                <floatingtext xmi.id="u4pJAytalsYSG" localid="uC2dQTWWCD4RT" textcolor="none" linecolor="#990000" linewidth="0" usefillcolor="1" usesdiagramfillcolor="1" usesdiagramusefillcolor="1" fillcolor="none" font="Noto Sans,9,-1,5,50,0,0,0,0,0,Regular" autoresize="1" x="600.632" y="154.97" width="45" height="20" isinstance="0" showstereotype="2" text="client" pretext="-" posttext="" role="710"/>
                <linepath layout="Direct">
                  <startpoint startx="600.202" starty="217.89"/>
                  <endpoint endx="598.632" endy="152.97"/>
                </linepath>
              </assocwidget>
            </associations>
          </diagram>
        </diagrams>
      </xmi:Extension>
    </packagedElement>
    <packagedElement xmi:type="uml:Model" xmi:id="Use_Case_View" name="Use Case View"/>
    <packagedElement xmi:type="uml:Model" xmi:id="Component_View" name="Component View"/>
    <packagedElement xmi:type="uml:Model" xmi:id="Deployment_View" name="Deployment View"/>
    <packagedElement xmi:type="uml:Model" xmi:id="Entity_Relationship_Model" name="Entity Relationship Model"/>
  </uml:Model>
  <xmi:Extension extender="umbrello">
    <docsettings viewid="uAXgfWDHDtpRq" documentation="" uniqueid="uaIBEvMaHCWCx"/>
    <listview>
      <listitem id="Views" type="800" open="1">
        <listitem id="Entity_Relationship_Model" type="836" open="1"/>
        <listitem id="Use_Case_View" type="802" open="1"/>
        <listitem id="Component_View" type="821" open="1"/>
        <listitem id="Deployment_View" type="827" open="1"/>
        <listitem id="Logical_View" type="801" open="1">
          <listitem id="uaMiu0M1tCdAW" type="813" open="1">
            <listitem id="usrrwNGRGiNAQ" type="814" open="0"/>
            <listitem id="uCNgkb3LR92Rn" type="814" open="0"/>
          </listitem>
          <listitem id="uAXgfWDHDtpRq" type="807" label="Diagramme de classes" open="0"/>
          <listitem id="uku4H11xzzata" type="813" open="1"/>
          <listitem id="ue6VHEr5LaqJ4" type="813" open="1"/>
          <listitem id="u3a7oNwdZS54A" type="813" open="1">
            <listitem id="uhrxix3QbPkhq" type="814" open="0"/>
            <listitem id="uMzfyoNTQ2NuY" type="815" open="0"/>
          </listitem>
          <listitem id="ugISpS66CmeV4" type="813" open="1">
            <listitem id="uXOaskfDu7Uuo" type="815" open="0"/>
            <listitem id="uMJGuT8OYntMt" type="815" open="0"/>
            <listitem id="uY2nvmIVXgsbm" type="814" open="0"/>
          </listitem>
          <listitem id="udKJwT8Aq5I5F" type="813" open="1"/>
          <listitem id="uCICvSvUVzle2" type="813" open="1">
            <listitem id="uBaH24rcuZWPd" type="815" open="0"/>
            <listitem id="uqsz7sHuLzNdX" type="815" open="0"/>
            <listitem id="uaLCuCJfU12yn" type="814" open="0"/>
          </listitem>
          <listitem id="Datatypes" type="830" open="1">
            <listitem id="u5NT2HyoWiQYr" type="829" open="1"/>
            <listitem id="uyyJ39SIemc0c" type="829" open="1"/>
            <listitem id="u6LiBLv6Mv80b" type="829" open="1"/>
            <listitem id="umB5oOYSJYL4c" type="829" open="1"/>
            <listitem id="uUlNdcmrefvuB" type="829" open="1"/>
            <listitem id="uQ3zJ84ylKWCV" type="829" open="1"/>
            <listitem id="u04O2ZcDWGj2f" type="829" open="1"/>
            <listitem id="uqKqSRRTaNODI" type="829" open="1"/>
            <listitem id="ux36MfKQ9JVSX" type="829" open="1"/>
            <listitem id="umamIicrIAJTF" type="829" open="1"/>
            <listitem id="ufU8hwfcOmuem" type="829" open="1"/>
            <listitem id="ujz9r0RSQ441u" type="829" open="1"/>
            <listitem id="uaLzD1m7zentY" type="829" open="1"/>
            <listitem id="uXByz3aN6ubOP" type="829" open="1"/>
            <listitem id="uWlFKXAz7blUs" type="829" open="1"/>
            <listitem id="uQ5v5v8s5JHR2" type="829" open="1"/>
            <listitem id="uceg2ja9RojPk" type="829" open="1"/>
            <listitem id="u9DMMuXW4UgLK" type="829" open="1"/>
          </listitem>
          <listitem id="utwJU5c4deiX4" type="813" open="1">
            <listitem id="uQV7VZJsDfCOR" type="814" open="0"/>
            <listitem id="ulqt0eTq9LCyp" type="815" open="0"/>
            <listitem id="u8frat32juRHt" type="815" open="0"/>
            <listitem id="us1USQE4TBz31" type="815" open="0"/>
            <listitem id="uxUrcpsgNsWzO" type="814" open="0"/>
          </listitem>
        </listitem>
      </listitem>
    </listview>
    <codegeneration>
      <codegenerator language="Java"/>
    </codegeneration>
  </xmi:Extension>
</xmi:XMI>
