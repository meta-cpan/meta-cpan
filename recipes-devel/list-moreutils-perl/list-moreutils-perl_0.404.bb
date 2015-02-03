DESCRIPTION = "List::MoreUtils provides some trivial but commonly needed functionality \
on lists which is not going to go into List::Util."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/List-MoreUtils"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/List-MoreUtils-0.404.tar.gz"

SRC_URI[md5sum] = "ce218cd10fb06b95260212a8faa374ce"
SRC_URI[sha256sum] = "046a53458f2e3b2dc4ef82e3035f8d5379a23779f2dbc474119fbe227c6c8f34"
RDEPENDS_${PN} += "exporter-tiny-perl"
RECOMMENDS += "config-autoconf-perl-native"
RECOMMENDS += "test-leaktrace-perl-native"

S = "${WORKDIR}/List-MoreUtils-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
