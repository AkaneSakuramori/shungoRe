.class public abstract Lc3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc3/j;


# instance fields
.field public final b:Lj3/l;

.field public final c:Lc3/j;


# direct methods
.method public constructor <init>(Lc3/j;Lr3/i;)V
    .locals 1

    const-string v0, "baseKey"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lc3/b;->b:Lj3/l;

    instance-of p2, p1, Lc3/b;

    if-eqz p2, :cond_0

    check-cast p1, Lc3/b;

    iget-object p1, p1, Lc3/b;->c:Lc3/j;

    :cond_0
    iput-object p1, p0, Lc3/b;->c:Lc3/j;

    return-void
.end method


# virtual methods
.method public final a(Lc3/i;)Lc3/i;
    .locals 1

    const-string v0, "element"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lc3/b;->b:Lj3/l;

    invoke-interface {v0, p1}, Lj3/l;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc3/i;

    return-object p1
.end method
