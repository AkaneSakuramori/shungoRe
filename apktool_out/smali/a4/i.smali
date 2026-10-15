.class public final La4/i;
.super La4/j;
.source "SourceFile"


# virtual methods
.method public final b(La4/b0;)V
    .locals 2

    const-string v0, "stream"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, La4/b;->g:La4/b;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, La4/b0;->c(La4/b;Ljava/io/IOException;)V

    return-void
.end method
