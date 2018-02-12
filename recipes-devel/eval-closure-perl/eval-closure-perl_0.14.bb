DESCRIPTION = "String eval is often used for dynamic code generation. For instance, \
"Moose" uses it heavily, to generate inlined versions of accessors and \
constructors, which speeds code up at runtime by a significant amount. \
String eval is not without its issues however - it's difficult to control \
the scope it's used in (which determines which variables are in scope \
inside the eval), and it's easy to miss compilation errors, since eval \
catches them and sticks them in $@ instead."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Eval-Closure"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DO/DOY/Eval-Closure-0.14.tar.gz"

SRC_URI[md5sum] = "ceeb1fc579ac9af981fa6b600538c285"
SRC_URI[sha256sum] = "ea0944f2f5ec98d895bef6d503e6e4a376fea6383a6bc64c7670d46ff2218cad"
RRECOMMENDS_${PN} += "devel-lexalias-perl"
RRECOMMENDS_${PN} += "perl-tidy-perl"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/Eval-Closure-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
