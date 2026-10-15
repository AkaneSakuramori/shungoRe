.class public final Lj1/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/LinkedHashMap;

.field public final b:Ljava/util/LinkedHashMap;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public final e:Lj1/m;


# direct methods
.method public constructor <init>(Lf1/a;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lj1/n0;->a:Ljava/util/LinkedHashMap;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lj1/n0;->b:Ljava/util/LinkedHashMap;

    const-string p1, "https"

    iput-object p1, p0, Lj1/n0;->c:Ljava/lang/String;

    new-instance p1, Lg0/a;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lg0/a;-><init>(I)V

    new-instance v0, Lj1/m;

    iget-boolean v1, p1, Lg0/a;->b:Z

    iget v2, p1, Lg0/a;->a:I

    iget-object p1, p1, Lg0/a;->c:Ljava/lang/Object;

    check-cast p1, Lj1/j;

    invoke-direct {v0, v1, v2, p1}, Lj1/m;-><init>(ZILj1/j;)V

    iput-object v0, p0, Lj1/n0;->e:Lj1/m;

    return-void
.end method
