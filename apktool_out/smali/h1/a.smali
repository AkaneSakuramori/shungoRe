.class public abstract Lh1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lg1/b;

.field public final b:Lh1/f;

.field public final c:La4/e0;


# direct methods
.method public constructor <init>(Lg1/b;Lh1/e;Lz0/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh1/a;->a:Lg1/b;

    iput-object p2, p0, Lh1/a;->b:Lh1/f;

    new-instance p1, La4/e0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh1/a;->c:La4/e0;

    return-void
.end method


# virtual methods
.method public final a(JJ)Z
    .locals 6

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lh1/a;->c:La4/e0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const/16 v0, 0x3e8

    int-to-long v4, v0

    mul-long/2addr p3, v4

    add-long/2addr p3, v2

    cmp-long p1, p1, p3

    if-gtz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method
