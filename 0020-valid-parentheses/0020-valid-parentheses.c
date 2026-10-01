bool isValid(char* s) {
    char stack[strlen(s)];
    int top=0;
  for(int i=0;s[i]!='\0';i++){
    if(s[i]=='{'||s[i]=='['||s[i]=='('){
        stack[top++]=s[i];
    }else if(top==0){
        stack[top++]=s[i];
    }else if((s[i]==')'&&stack[top-1]=='(')||(s[i]==']'&&stack[top-1]=='[')||(s[i]=='}'&&stack[top-1]=='{'))
    {
        top--;
    }else{
        stack[top++]=s[i];
    }
  }
  if(top==0)return true;
  else return false;  
}