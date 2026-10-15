.class public final Lp3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp3/c;


# instance fields
.field public final a:Lp3/c;

.field public final b:Lj3/l;


# direct methods
.method public constructor <init>(Lq3/c;La3/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp3/h;->a:Lp3/c;

    iput-object p2, p0, Lp3/h;->b:Lj3/l;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lp3/g;

    invoke-direct {v0, p0}, Lp3/g;-><init>(Lp3/h;)V

    return-object v0
.end method
