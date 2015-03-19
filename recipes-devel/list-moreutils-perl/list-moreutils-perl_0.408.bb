DESCRIPTION = "List::MoreUtils provides some trivial but commonly needed functionality \
on lists which is not going to go into List::Util."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/List-MoreUtils"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/List-MoreUtils-0.408.tar.gz"

SRC_URI[md5sum] = "40fd45f5f5814ecffbf645d91ee44b60"
SRC_URI[sha256sum] = "93bf92e2dd560b90e4acdc12c24ca80ac1452e4a33bebe7860d02eda4ba3b9e1"
RDEPENDS_${PN} += "exporter-tiny-perl"
RECOMMENDS += "inc-latest-perl-native"
RECOMMENDS += "test-leaktrace-perl-native"
RECOMMENDS += "test-writevariants-perl-native"

S = "${WORKDIR}/List-MoreUtils-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
