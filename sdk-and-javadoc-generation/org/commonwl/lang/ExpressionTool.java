
/*****************************************************************************************************
*
*  Authors:
*          
*          <b> Java SDK for CWL </b>
*          
*            @author Paul Grosu (pgrosu@gmail.com), Northeastern University
*            @version 0.20
*            @since April 28, 2016
*          
*          <p> Alternate SDK (via Avro): 
*          
*            Denis Yuen (denis.yuen@gmail.com)
*          
*          CWL Draft:
*          
*            Peter Amstutz (peter.amstutz@curoverse.com), Curoverse
*            Nebojsa Tijanic (nebojsa.tijanic@sbgenomics.com), Seven Bridges Genomics
*          
*            Contributors:
*          
*            Luka Stojanovic (luka.stojanovic@sbgenomics.com), Seven Bridges Genomics
*            John Chilton (jmchilton@gmail.com), Galaxy Project, Pennsylvania State University
*            Michael R. Crusoe (crusoe@ucdavis.edu), University of California, Davis
*            Herve Menager (herve.menager@gmail.com), Institut Pasteur
*            Maxim Mikheev (mikhmv@biodatomics.com), BioDatomics
*            Stian Soiland-Reyes (soiland-reyes@cs.manchester.ac.uk), University of Manchester
*
*****************************************************************************************************/

package org.commonwl.lang;

/*****************************************************************************************************
*
*  Execute an expression as a Workflow step.
*/
public class ExpressionTool implements Process {

  /*****************************************************************************************************
  *
  *  The expression to execute.  The expression must return a JSON object which matches the output parameters of the ExpressionTool.
  */
  Object expression = null;

  String class_value = null;


  /*****************************************************************************************************
  *
  *  Defines the parameters representing the output of the process.  May be used to generate and/or validate the output object.
  */
  ExpressionToolOutputParameter [] outputs = null;

  /*****************************************************************************************************
  *
  *  Declares requirements that apply to either the runtime environment or the workflow engine that must be met in order to execute this process.  If an implementation cannot satisfy all requirements, or a requirement is listed which is not recognized by the implementation, it is a fatal error and the implementation must not attempt to run the process, unless overridden at user option.
  */
  Object requirements = null;

  /*****************************************************************************************************
  *
  *  CWL document version. Always required at the document root. Not required for a Process embedded inside another Process.
  */
  CWLVersion cwlVersion = null;

  /*****************************************************************************************************
  *
  *  Defines the input parameters of the process.  The process is ready to run when all required input parameters are associated with concrete values.  Input parameters include a schema for each parameter which is used to validate the input object.  It may also be used to build a user interface for constructing the input object.
  */
  InputParameter [] inputs = null;

  /*****************************************************************************************************
  *
  *  Declares hints applying to either the runtime environment or the workflow engine that may be helpful in executing this process.  It is not an error if an implementation cannot satisfy all hints, however the implementation may report a warning.
  */
  Any hints = null;

  /*****************************************************************************************************
  *
  *  A long, human-readable description of this process object.
  */
  String doc = null;

  /*****************************************************************************************************
  *
  *  The unique identifier for this process object.
  */
  String id = null;

  /*****************************************************************************************************
  *
  *  A short, human-readable label of this process object.
  */
  String label = null;


  public ExpressionTool() { super(); }

  /*****************************************************************************************************
  *
  *  This method sets the value of expression.
  *
  *  @param   value will update expression, which is a String type.
  *
  */
  public void setexpression( String value ) {
    expression = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of expression.
  *
  *  @param   value will update expression, which is a Expression type.
  *
  */
  public void setexpression( Expression value ) {
    expression = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of expression.
  *
  *  @return   This method will return the value of expression, which is a Object type.
  *
  */
  public Object getexpression() {
    return expression;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of class_value.
  *
  *  @param   value will update class_value, which is a String type.
  *
  */
  public void setclass( String value ) {
    class_value = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of class_value.
  *
  *  @return   This method will return the value of class_value, which is a String type.
  *
  */
  public String getclass() {
    return class_value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of outputs.
  *
  *  @param   value will update outputs, which is a OutputParameter array.
  *
  */
  public void setoutputs( ExpressionToolOutputParameter [] value ) {
    outputs = value;
  }

  /*****************************************************************************************************
  *
  *  This is a dummy method which has no functionality, and is required 
  *  for implementing an interface method that was previously specialized.
  *
  *
  */
  public void setoutputs( OutputParameter [] value ) {

  }

  /*****************************************************************************************************
  *
  *  This method returns the value of outputs.
  *
  *  @return   This method will return the value of outputs, which is a ExpressionToolOutputParameter array.
  *
  */
  public ExpressionToolOutputParameter [] getoutputs() {
    return outputs;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of requirements.
  *
  *  @param   value will update requirements, which is a StepInputExpressionRequirement type.
  *
  */
  public void setrequirements( StepInputExpressionRequirement value ) {
    requirements = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of requirements.
  *
  *  @param   value will update requirements, which is a MultipleInputFeatureRequirement type.
  *
  */
  public void setrequirements( MultipleInputFeatureRequirement value ) {
    requirements = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of requirements.
  *
  *  @param   value will update requirements, which is a SoftwareRequirement type.
  *
  */
  public void setrequirements( SoftwareRequirement value ) {
    requirements = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of requirements.
  *
  *  @param   value will update requirements, which is a SchemaDefRequirement type.
  *
  */
  public void setrequirements( SchemaDefRequirement value ) {
    requirements = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of requirements.
  *
  *  @param   value will update requirements, which is a InitialWorkDirRequirement type.
  *
  */
  public void setrequirements( InitialWorkDirRequirement value ) {
    requirements = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of requirements.
  *
  *  @param   value will update requirements, which is a EnvVarRequirement type.
  *
  */
  public void setrequirements( EnvVarRequirement value ) {
    requirements = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of requirements.
  *
  *  @param   value will update requirements, which is a DockerRequirement type.
  *
  */
  public void setrequirements( DockerRequirement value ) {
    requirements = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of requirements.
  *
  *  @param   value will update requirements, which is a ResourceRequirement type.
  *
  */
  public void setrequirements( ResourceRequirement value ) {
    requirements = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of requirements.
  *
  *  @param   value will update requirements, which is a InlineJavascriptRequirement type.
  *
  */
  public void setrequirements( InlineJavascriptRequirement value ) {
    requirements = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of requirements.
  *
  *  @param   value will update requirements, which is a ShellCommandRequirement type.
  *
  */
  public void setrequirements( ShellCommandRequirement value ) {
    requirements = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of requirements.
  *
  *  @param   value will update requirements, which is a ScatterFeatureRequirement type.
  *
  */
  public void setrequirements( ScatterFeatureRequirement value ) {
    requirements = value;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of requirements.
  *
  *  @param   value will update requirements, which is a SubworkflowFeatureRequirement type.
  *
  */
  public void setrequirements( SubworkflowFeatureRequirement value ) {
    requirements = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of requirements.
  *
  *  @return   This method will return the value of requirements, which is a Object type.
  *
  */
  public Object getrequirements() {
    return requirements;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of cwlVersion.
  *
  *  @param   value will update cwlVersion, which is a CWLVersion type.
  *
  */
  public void setcwlVersion( CWLVersion value ) {
    cwlVersion = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of cwlVersion.
  *
  *  @return   This method will return the value of cwlVersion, which is a CWLVersion type.
  *
  */
  public CWLVersion getcwlVersion() {
    return cwlVersion;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of inputs.
  *
  *  @param   value will update inputs, which is a InputParameter array.
  *
  */
  public void setinputs( InputParameter [] value ) {
    inputs = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of inputs.
  *
  *  @return   This method will return the value of inputs, which is a InputParameter array.
  *
  */
  public InputParameter [] getinputs() {
    return inputs;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of hints.
  *
  *  @param   value will update hints, which is a Any type.
  *
  */
  public void sethints( Any value ) {
    hints = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of hints.
  *
  *  @return   This method will return the value of hints, which is a Any type.
  *
  */
  public Any gethints() {
    return hints;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of doc.
  *
  *  @param   value will update doc, which is a String type.
  *
  */
  public void setdoc( String value ) {
    doc = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of doc.
  *
  *  @return   This method will return the value of doc, which is a String type.
  *
  */
  public String getdoc() {
    return doc;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of id.
  *
  *  @param   value will update id, which is a String type.
  *
  */
  public void setid( String value ) {
    id = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of id.
  *
  *  @return   This method will return the value of id, which is a String type.
  *
  */
  public String getid() {
    return id;
  }

  /*****************************************************************************************************
  *
  *  This method sets the value of label.
  *
  *  @param   value will update label, which is a String type.
  *
  */
  public void setlabel( String value ) {
    label = value;
  }

  /*****************************************************************************************************
  *
  *  This method returns the value of label.
  *
  *  @return   This method will return the value of label, which is a String type.
  *
  */
  public String getlabel() {
    return label;
  }

}