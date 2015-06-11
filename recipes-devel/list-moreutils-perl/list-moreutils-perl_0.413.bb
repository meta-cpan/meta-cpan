DESCRIPTION = "List::MoreUtils provides some trivial but commonly needed functionality \
on lists which is not going to go into List::Util."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/List-MoreUtils"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/List-MoreUtils-0.413.tar.gz"

SRC_URI[md5sum] = "bc577c86455e2d1397187bce286a53b9"
SRC_URI[sha256sum] = "4d6429d5672ce74a59d6490320252cb8b5b8285db8fe9c6551a4162e5375ef37"
RDEPENDS_${PN} += "exporter-tiny-perl"
RECOMMENDS += "config-autoconf-perl-native"
RECOMMENDS += "inc-latest-perl-native"
RECOMMENDS += "test-leaktrace-perl-native"

S = "${WORKDIR}/List-MoreUtils-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
