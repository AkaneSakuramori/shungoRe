.class public abstract Lp2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lp2/d;


# instance fields
.field public final a:Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp2/d;

    const-class v1, Ljava/util/Date;

    invoke-direct {v0, v1}, Lp2/e;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lp2/e;->b:Lp2/d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp2/e;->a:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/util/Date;)Ljava/util/Date;
.end method
