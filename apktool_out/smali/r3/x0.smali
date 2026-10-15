.class public final Lr3/x0;
.super Lr3/k;
.source "SourceFile"


# static fields
.field public static final synthetic d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr3/x0;

    invoke-direct {v0}, Lr3/k;-><init>()V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.Unconfined"

    return-object v0
.end method

.method public final z(Lc3/k;Ljava/lang/Runnable;)V
    .locals 0

    sget-object p2, Lr3/a1;->c:Lr3/l;

    invoke-interface {p1, p2}, Lc3/k;->e(Lc3/j;)Lc3/i;

    move-result-object p1

    invoke-static {p1}, La;->k(Lc3/i;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
