.class public final Lr3/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc3/i;
.implements Lc3/j;


# static fields
.field public static final b:Lr3/z0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr3/z0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lr3/z0;->b:Lr3/z0;

    return-void
.end method


# virtual methods
.method public final e(Lc3/j;)Lc3/i;
    .locals 0

    invoke-static {p0, p1}, Lc3/h;->L0(Lc3/i;Lc3/j;)Lc3/i;

    move-result-object p1

    return-object p1
.end method

.method public final getKey()Lc3/j;
    .locals 0

    return-object p0
.end method

.method public final h(Ljava/lang/Object;Lj3/p;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p2, p1, p0}, Lj3/p;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final t(Lc3/j;)Lc3/k;
    .locals 0

    invoke-static {p0, p1}, Lc3/h;->A1(Lc3/i;Lc3/j;)Lc3/k;

    move-result-object p1

    return-object p1
.end method

.method public final x(Lc3/k;)Lc3/k;
    .locals 0

    invoke-static {p0, p1}, Lc3/h;->V1(Lc3/i;Lc3/k;)Lc3/k;

    move-result-object p1

    return-object p1
.end method
