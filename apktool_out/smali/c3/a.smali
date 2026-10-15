.class public abstract Lc3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc3/i;


# instance fields
.field public final b:Lc3/j;


# direct methods
.method public constructor <init>(Lc3/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc3/a;->b:Lc3/j;

    return-void
.end method


# virtual methods
.method public e(Lc3/j;)Lc3/i;
    .locals 0

    invoke-static {p0, p1}, Lc3/h;->L0(Lc3/i;Lc3/j;)Lc3/i;

    move-result-object p1

    return-object p1
.end method

.method public final getKey()Lc3/j;
    .locals 1

    iget-object v0, p0, Lc3/a;->b:Lc3/j;

    return-object v0
.end method

.method public final h(Ljava/lang/Object;Lj3/p;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p2, p1, p0}, Lj3/p;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public t(Lc3/j;)Lc3/k;
    .locals 0

    invoke-static {p0, p1}, Lc3/h;->A1(Lc3/i;Lc3/j;)Lc3/k;

    move-result-object p1

    return-object p1
.end method

.method public final x(Lc3/k;)Lc3/k;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lc3/h;->W1(Lc3/k;Lc3/k;)Lc3/k;

    move-result-object p1

    return-object p1
.end method
