<?xml version="1.0" encoding="UTF-8" ?>

<Form version="1.3" maxVersion="1.9" type="org.netbeans.modules.form.forminfo.JFrameFormInfo">
  <Properties>
    <Property name="defaultCloseOperation" type="int" value="3"/>
  </Properties>
  <SyntheticProperties>
    <SyntheticProperty name="formSizePolicy" type="int" value="1"/>
    <SyntheticProperty name="generateCenter" type="boolean" value="false"/>
  </SyntheticProperties>
  <AuxValues>
    <AuxValue name="FormSettings_autoResourcing" type="java.lang.Integer" value="0"/>
    <AuxValue name="FormSettings_autoSetComponentName" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_generateFQN" type="java.lang.Boolean" value="true"/>
    <AuxValue name="FormSettings_generateMnemonicsCode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_i18nAutoMode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_layoutCodeTarget" type="java.lang.Integer" value="1"/>
    <AuxValue name="FormSettings_listenerGenerationStyle" type="java.lang.Integer" value="0"/>
    <AuxValue name="FormSettings_variablesLocal" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_variablesModifier" type="java.lang.Integer" value="2"/>
  </AuxValues>

  <Layout>
    <DimensionLayout dim="0">
      <Group type="103" groupAlignment="0" attributes="0">
          <Group type="102" alignment="0" attributes="0">
              <EmptySpace min="-2" pref="27" max="-2" attributes="0"/>
              <Group type="103" groupAlignment="1" attributes="0">
                  <Group type="102" alignment="1" attributes="0">
                      <Group type="103" groupAlignment="0" attributes="0">
                          <Component id="jLabel1" alignment="0" min="-2" max="-2" attributes="0"/>
                          <Component id="jLabel2" alignment="0" min="-2" max="-2" attributes="0"/>
                          <Component id="jLabel3" alignment="0" min="-2" max="-2" attributes="0"/>
                      </Group>
                      <EmptySpace max="-2" attributes="0"/>
                      <Group type="103" groupAlignment="0" max="-2" attributes="0">
                          <Component id="nome" max="32767" attributes="0"/>
                          <Component id="palitinhos" max="32767" attributes="0"/>
                          <Component id="aposta" pref="134" max="32767" attributes="0"/>
                      </Group>
                  </Group>
                  <Group type="102" alignment="1" attributes="0">
                      <Component id="VaiButton" min="-2" pref="98" max="-2" attributes="0"/>
                      <EmptySpace type="separate" max="-2" attributes="0"/>
                      <Component id="jButton1" min="-2" pref="81" max="-2" attributes="0"/>
                  </Group>
              </Group>
              <EmptySpace min="-2" pref="41" max="-2" attributes="0"/>
              <Group type="103" groupAlignment="0" attributes="0">
                  <Component id="jLabel4" min="-2" max="-2" attributes="0"/>
                  <Component id="jScrollPane1" min="-2" pref="248" max="-2" attributes="0"/>
              </Group>
              <EmptySpace pref="41" max="32767" attributes="0"/>
          </Group>
      </Group>
    </DimensionLayout>
    <DimensionLayout dim="1">
      <Group type="103" groupAlignment="0" attributes="0">
          <Group type="102" alignment="0" attributes="0">
              <Group type="103" groupAlignment="1" attributes="0">
                  <Group type="102" alignment="1" attributes="0">
                      <EmptySpace max="-2" attributes="0"/>
                      <Component id="jLabel4" min="-2" max="-2" attributes="0"/>
                      <EmptySpace max="-2" attributes="0"/>
                      <Component id="jScrollPane1" min="-2" pref="162" max="-2" attributes="0"/>
                  </Group>
                  <Group type="102" alignment="0" attributes="0">
                      <EmptySpace min="-2" pref="42" max="-2" attributes="0"/>
                      <Group type="103" groupAlignment="3" attributes="0">
                          <Component id="jLabel1" alignment="3" min="-2" max="-2" attributes="0"/>
                          <Component id="nome" alignment="3" min="-2" max="-2" attributes="0"/>
                      </Group>
                      <EmptySpace type="separate" max="-2" attributes="0"/>
                      <Group type="103" groupAlignment="3" attributes="0">
                          <Component id="jLabel2" alignment="3" min="-2" max="-2" attributes="0"/>
                          <Component id="palitinhos" alignment="3" min="-2" max="-2" attributes="0"/>
                      </Group>
                      <EmptySpace type="separate" max="-2" attributes="0"/>
                      <Group type="103" groupAlignment="3" attributes="0">
                          <Component id="jLabel3" alignment="3" min="-2" max="-2" attributes="0"/>
                          <Component id="aposta" alignment="3" min="-2" max="-2" attributes="0"/>
                      </Group>
                      <EmptySpace min="-2" pref="50" max="-2" attributes="0"/>
                      <Group type="103" groupAlignment="0" max="-2" attributes="0">
                          <Component id="jButton1" max="32767" attributes="0"/>
                          <Component id="VaiButton" max="32767" attributes="0"/>
                      </Group>
                  </Group>
              </Group>
              <EmptySpace pref="30" max="32767" attributes="0"/>
          </Group>
      </Group>
    </DimensionLayout>
  </Layout>
  <SubComponents>
    <Component class="javax.swing.JLabel" name="jLabel1">
      <Properties>
        <Property name="text" type="java.lang.String" value="Nome:"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JTextField" name="nome">
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="nomeActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JLabel" name="jLabel2">
      <Properties>
        <Property name="text" type="java.lang.String" value="Palitinhos:"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JTextField" name="palitinhos">
    </Component>
    <Component class="javax.swing.JLabel" name="jLabel3">
      <Properties>
        <Property name="text" type="java.lang.String" value="Aposta:"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JTextField" name="aposta">
    </Component>
    <Component class="javax.swing.JButton" name="jButton1">
      <Properties>
        <Property name="text" type="java.lang.String" value="Enviar"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="jButton1ActionPerformed"/>
      </Events>
    </Component>
    <Container class="javax.swing.JScrollPane" name="jScrollPane1">
      <AuxValues>
        <AuxValue name="autoScrollPane" type="java.lang.Boolean" value="true"/>
      </AuxValues>

      <Layout class="org.netbeans.modules.form.compat2.layouts.support.JScrollPaneSupportLayout"/>
      <SubComponents>
        <Component class="javax.swing.JTextArea" name="Resposta">
          <Properties>
            <Property name="columns" type="int" value="20"/>
            <Property name="rows" type="int" value="5"/>
          </Properties>
        </Component>
      </SubComponents>
    </Container>
    <Component class="javax.swing.JLabel" name="jLabel4">
      <Properties>
        <Property name="text" type="java.lang.String" value="Resultado:"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JButton" name="VaiButton">
      <Properties>
        <Property name="text" type="java.lang.String" value="Encerrar"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="VaiButtonActionPerformed"/>
      </Events>
    </Component>
  </SubComponents>
</Form>