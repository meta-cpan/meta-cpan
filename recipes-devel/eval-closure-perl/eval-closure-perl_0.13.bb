DESCRIPTION = "String eval is often used for dynamic code generation. For instance, \
\"Moose\" uses it heavily, to generate inlined versions of accessors \
and constructors, \
which speeds code up at runtime by a significant amount. String eval is \
not \
without its issues however - it's difficult to control the scope it's \
used \
in (which determines which variables are in scope inside the eval), and \
it's \
easy to miss compilation errors, since eval catches them and sticks \
them in \
$@ instead."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Eval-Closure"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DO/DOY/Eval-Closure-0.13.tar.gz"

SRC_URI[md5sum] = "20e12ab8b6d4f8370a9d3d89b587040a"
SRC_URI[sha256sum] = "65bec0368e8f0631a24bf6dc6dd24d2d8d485350e406d20005db2c6aa1c0445d"
RDEPENDS_${PN} += "try-tiny-perl"
RRECOMMENDS_${PN} += "devel-lexalias-perl"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-requires-perl-native"

S = "${WORKDIR}/Eval-Closure-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
