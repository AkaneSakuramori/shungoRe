.class public final Ls1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Lf2/a;


# instance fields
.field public final a:Lf2/c;

.field public final b:Lf2/c;

.field public final c:Lf2/c;

.field public final d:Lf2/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf2/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf2/a;-><init>(F)V

    sput-object v0, Ls1/d;->e:Lf2/a;

    return-void
.end method

.method public constructor <init>(Lf2/c;Lf2/c;Lf2/c;Lf2/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/d;->a:Lf2/c;

    iput-object p3, p0, Ls1/d;->b:Lf2/c;

    iput-object p4, p0, Ls1/d;->c:Lf2/c;

    iput-object p2, p0, Ls1/d;->d:Lf2/c;

    return-void
.end method
