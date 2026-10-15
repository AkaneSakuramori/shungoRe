.class public final Lu2/e;
.super Le3/g;
.source "SourceFile"

# interfaces
.implements Lj3/p;


# instance fields
.field public f:I

.field public final synthetic g:Lcom/shungo/app/InjectorService;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lcom/shungo/app/InjectorService;


# direct methods
.method public constructor <init>(Lcom/shungo/app/InjectorService;Ljava/lang/String;Lcom/shungo/app/InjectorService;Lc3/e;)V
    .locals 0

    iput-object p1, p0, Lu2/e;->g:Lcom/shungo/app/InjectorService;

    iput-object p2, p0, Lu2/e;->h:Ljava/lang/String;

    iput-object p3, p0, Lu2/e;->i:Lcom/shungo/app/InjectorService;

    invoke-direct {p0, p4}, Le3/g;-><init>(Lc3/e;)V

    return-void
.end method


# virtual methods
.method public final a(Lc3/e;)Lc3/e;
    .locals 4

    new-instance v0, Lu2/e;

    iget-object v1, p0, Lu2/e;->i:Lcom/shungo/app/InjectorService;

    iget-object v2, p0, Lu2/e;->g:Lcom/shungo/app/InjectorService;

    iget-object v3, p0, Lu2/e;->h:Ljava/lang/String;

    invoke-direct {v0, v2, v3, v1, p1}, Lu2/e;-><init>(Lcom/shungo/app/InjectorService;Ljava/lang/String;Lcom/shungo/app/InjectorService;Lc3/e;)V

    return-object v0
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr3/o;

    check-cast p2, Lc3/e;

    invoke-virtual {p0, p2}, Lu2/e;->a(Lc3/e;)Lc3/e;

    move-result-object p1

    check-cast p1, Lu2/e;

    sget-object p2, Lz2/f;->a:Lz2/f;

    invoke-virtual {p1, p2}, Lu2/e;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Ld3/a;->b:Ld3/a;

    iget v1, p0, Lu2/e;->f:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lc3/h;->D2(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lc3/h;->D2(Ljava/lang/Object;)V

    sget-object p1, Lw2/d;->a:Lt3/u;

    iget-object v3, p0, Lu2/e;->g:Lcom/shungo/app/InjectorService;

    const-string v4, "/api/shungo/catched"

    const-string v5, ""

    iget-object v6, p0, Lu2/e;->h:Ljava/lang/String;

    const/16 v8, 0x10

    iput v2, p0, Lu2/e;->f:I

    move-object v7, p0

    invoke-static/range {v3 .. v8}, Lw2/d;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc3/e;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lw2/a;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "catch "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_3

    new-instance v2, Ljava/lang/Integer;

    iget v3, p1, Lw2/a;->b:I

    invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V

    goto :goto_1

    :cond_3
    move-object v2, v1

    :goto_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Shungo"

    invoke-static {v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lu2/e;->i:Lcom/shungo/app/InjectorService;

    iget-object v2, v0, Lcom/shungo/app/InjectorService;->d:Ljava/io/BufferedWriter;

    if-eqz v2, :cond_5

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz p1, :cond_4

    new-instance v1, Ljava/lang/Integer;

    iget p1, p1, Lw2/a;->b:I

    invoke-direct {v1, p1}, Ljava/lang/Integer;-><init>(I)V

    :cond_4
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x7d

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :cond_5
    iget-object p1, v0, Lcom/shungo/app/InjectorService;->d:Ljava/io/BufferedWriter;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ljava/io/BufferedWriter;->newLine()V

    :cond_6
    iget-object p1, v0, Lcom/shungo/app/InjectorService;->d:Ljava/io/BufferedWriter;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ljava/io/BufferedWriter;->flush()V

    :cond_7
    sget-object p1, Lz2/f;->a:Lz2/f;

    return-object p1
.end method
