.class public final Lu2/f;
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

    iput-object p1, p0, Lu2/f;->g:Lcom/shungo/app/InjectorService;

    iput-object p2, p0, Lu2/f;->h:Ljava/lang/String;

    iput-object p3, p0, Lu2/f;->i:Lcom/shungo/app/InjectorService;

    invoke-direct {p0, p4}, Le3/g;-><init>(Lc3/e;)V

    return-void
.end method


# virtual methods
.method public final a(Lc3/e;)Lc3/e;
    .locals 4

    new-instance v0, Lu2/f;

    iget-object v1, p0, Lu2/f;->i:Lcom/shungo/app/InjectorService;

    iget-object v2, p0, Lu2/f;->g:Lcom/shungo/app/InjectorService;

    iget-object v3, p0, Lu2/f;->h:Ljava/lang/String;

    invoke-direct {v0, v2, v3, v1, p1}, Lu2/f;-><init>(Lcom/shungo/app/InjectorService;Ljava/lang/String;Lcom/shungo/app/InjectorService;Lc3/e;)V

    return-object v0
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr3/o;

    check-cast p2, Lc3/e;

    invoke-virtual {p0, p2}, Lu2/f;->a(Lc3/e;)Lc3/e;

    move-result-object p1

    check-cast p1, Lu2/f;

    sget-object p2, Lz2/f;->a:Lz2/f;

    invoke-virtual {p1, p2}, Lu2/f;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Ld3/a;->b:Ld3/a;

    iget v1, p0, Lu2/f;->f:I

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

    sget-object p1, Lr3/x;->b:Lkotlinx/coroutines/scheduling/c;

    new-instance v1, Lu2/e;

    iget-object v3, p0, Lu2/f;->g:Lcom/shungo/app/InjectorService;

    iget-object v4, p0, Lu2/f;->h:Ljava/lang/String;

    iget-object v5, p0, Lu2/f;->i:Lcom/shungo/app/InjectorService;

    const/4 v6, 0x0

    invoke-direct {v1, v3, v4, v5, v6}, Lu2/e;-><init>(Lcom/shungo/app/InjectorService;Ljava/lang/String;Lcom/shungo/app/InjectorService;Lc3/e;)V

    iput v2, p0, Lu2/f;->f:I

    invoke-static {p1, v1, p0}, Lc3/h;->L2(Lkotlinx/coroutines/scheduling/c;Lj3/p;Lc3/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lz2/f;->a:Lz2/f;

    return-object p1
.end method
