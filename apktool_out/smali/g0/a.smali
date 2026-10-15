.class public final Lg0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Z

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p1

    sget v2, Lg0/m;->a:I

    invoke-static {p1}, Lg0/l;->a(Ljava/util/Locale;)I

    move-result p1

    if-ne p1, v1, :cond_0

    move v0, v1

    :cond_0
    iput-boolean v0, p0, Lg0/a;->b:Z

    sget-object p1, Lg0/c;->d:Lg0/j;

    iput-object p1, p0, Lg0/a;->c:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, p0, Lg0/a;->a:I

    return-void

    :cond_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v0, p0, Lg0/a;->b:Z

    iput v0, p0, Lg0/a;->a:I

    sget-object p1, Lj1/j;->c:Ljava/util/List;

    new-instance p1, Lt3/p;

    invoke-direct {p1, v1}, Lt3/p;-><init>(I)V

    new-instance v0, Lj1/j;

    iget-object p1, p1, Lt3/p;->a:Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Lj1/j;-><init>(Ljava/util/ArrayList;)V

    iput-object v0, p0, Lg0/a;->c:Ljava/lang/Object;

    return-void
.end method
